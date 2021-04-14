let vue=new Vue({
    el:"#app",
    data:{
        alluser:[],
        employee:{},
        delid:0
    },
    created(){
        this.findAll();
    },
    methods:{
      findAll(){
          axios.get(`employee`).then(response=>{
              this.alluser=response.data
          })
      },
        xuanze(e){
            var file = e.target.files[0];
            var fileReader = new FileReader();
            fileReader.readAsDataURL(file);
            fileReader.onloadend=function () {
                var result = fileReader.result;
                let obj={
                    base64: result,
                }
                this.$refs.image.src=result
                this.employee.employeeImg=result;
            }.bind(this)
        },


        qingkong(){
          this.employee={};
          this.$refs.image.src='';
        },
        xianshi(huixian){
            this.employee=huixian;
        },
        updateuser(){
          axios.put(`employee`,this.employee).then(response=>{
              this.findAll()
          })
        },
        adduser(){
            axios.post(`employee`,this.employee).then(response=>{
                this.findAll()
            })
        },
        AorU(){
            if(this.employee.employeeId){
                //修改
                this.updateuser();
                this.findAll()
            }else {
                //添加
                this.adduser();
                this.findAll()
            }
            this.employee={}
        },
        shanchu(id){
            this.delid=id;
        },
        delet(){
          axios.delete(`employee/${this.delid}`).then(response=>{
              this.findAll();
          })
        }

    }
})
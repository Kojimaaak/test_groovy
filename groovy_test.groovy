class groovy_test{
    def script

    def setup(def script){
        this.script = script
    }
    
    def method(){
        script.echo "***successful***"
    }
}

return new groovy_test()
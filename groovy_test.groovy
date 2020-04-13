class Hoge{
    def script

    def setup(def script){
        this.script = script
    }
    
    def method(){
        script.echo "Hoge"
    }
}

return new Hoge()
node{
    stage("Main"){
        def hoge = loadClass("groovy_test")
        hoge.method()
    }
}


def loadClass(def className){
    def rootDir = pwd()
    def instance = load "${rootDir}@script/util/${className}.groovy"
    instance.setup(this)
    return instance
}
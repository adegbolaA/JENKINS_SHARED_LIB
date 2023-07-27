def call(){
     dir('ChallengePackage/demo') {
                   
       sh 'mvn clean install'
    }
}
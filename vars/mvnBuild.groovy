def call(){
     dir('ChallengePackage/devops-project') {
                   
       sh 'mvn clean install'
    }
}
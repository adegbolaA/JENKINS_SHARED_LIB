def call(){
     dir('ChallengePackage/demo') {
   
       sh 'mvn test'
    }
}
def call(){
     dir('ChallengePackage/demo') {
                    // Execute 'mvn test' command
       sh 'mvn test'
    }
}
def call(credentialsId){
    dir('ChallengePackage/demo') {
        withSonarQubeEnv(credentialsId: credentialsId){
          sh 'mvn clean package sonar:sonar'
        }
    }
}
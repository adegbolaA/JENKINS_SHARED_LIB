def call(credentialsId){
    dir('ChallengePackage/devops-project') {
        withSonarQubeEnv(credentialsId: credentialsId){
          sh 'mvn clean package sonar:sonar'
        }
    }
}
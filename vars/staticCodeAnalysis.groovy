def call(credentialsId){
    dir('ChallengePackage/demo') {
        withSonarQubeEnv(credentialsId: 'sonarqube-api'){
          sh 'mvn clean package sonar:sonar'
        }
    }
}
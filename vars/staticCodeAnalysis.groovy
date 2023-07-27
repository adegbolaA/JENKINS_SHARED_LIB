def call(){
    dir('ChallengePackage/demo') {
        sh 'mvn clean package sonar:sonar'
    }
}
def call(){
    dir('ChallengePackage/demo') {
        sh 'mvn verify -DskipUnitTests'
    }
}
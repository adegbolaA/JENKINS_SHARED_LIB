def call(credentialsId){
    dir('ChallengePackage/demo') {
        waitForQualityGate abortPipeline: false, credentialsId: credentialsId
    }
}
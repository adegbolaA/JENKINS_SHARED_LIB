def call(credentialsId){
    dir('ChallengePackage/devops-project') {
        waitForQualityGate abortPipeline: false, credentialsId: credentialsId
    }
}
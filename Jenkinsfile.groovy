pipeline {
    agent any
    stages{
        stage("Cleanup") {
            steps{
                echo "Cleanup is successfully completed"
            }
        }
        stage("Build") {
            steps{
                echo "Build is successfully completed"
            }
        }
        stage("Test") {
            steps{
                echo "Testing is successfully completed"
            }
        }
        stage("Deploy") {
            steps{
                echo "Deployment is successfully completed"
            }
        }
    }
}
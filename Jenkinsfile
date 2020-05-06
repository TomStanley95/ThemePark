pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh 'sudo ./gradlew assemble'
            }
        }
        stage('Test') {
            steps {
                sh 'sudo ./gradlew test'
            }
        }
    }
}
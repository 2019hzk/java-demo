
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                withDockerContainer('maven:3.8-openjdk-8-slim') {
                    // some block
                    sh 'mvn -v '
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
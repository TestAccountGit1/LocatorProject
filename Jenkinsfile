pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/TestAccountGit1/LocatorProject.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
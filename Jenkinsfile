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
                dir('LocatorProject') {
                    bat 'mvn clean install'
                }
            }
        }
    }
}

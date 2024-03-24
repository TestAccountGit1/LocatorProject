pipeline {
    agent any
    
    stages {
    stage('clean')
        { 
            steps{
                deleteDir();
            }
            
        }
        
        
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/TestAccountGit1/LocatorProject.git'
            }
        }
        stage('Build') {
            steps {
                dir('LocatorTest/pom.xml') {
                    bat 'mvn clean install'
                }
            }
        }
    }
}

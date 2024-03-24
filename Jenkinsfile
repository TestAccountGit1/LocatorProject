pipeline {
    agent any
    
    stages {
    stage('clean')
        { 
            steps{
                deleteDir();
            }
            
        }
        stage("clone Repo") {
            steps {
                bat "git clone https://github.com/TestAccountGit1/LocatorProject.git"
            }
        }
        
    
        stage('Build') {
            steps {
                dir('LocatorTest') {
                    bat 'mvn test'
                }
            }
        }

        
    }
}


        
        
    

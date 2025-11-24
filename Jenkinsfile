

pipeline {
    agent any
    tools {
        // Ensure Maven is configured in Global Tool Configuration in Jenkins
        // with the name 'maven3'
        maven 'Maven 3.x' 
    }
    stages {
        stage('Checkout') {
            steps {
                // Get some code from a GitHub repository
                //git branch: 'feature/logoutOps', url: 'https://github.com/spal01/Demo.git'

                // Run Maven on a Unix agent.
               // sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
            stage('Build and Test') {
            steps {
                bat 'mvn clean verify' // Or 'mvn clean test' if you only want to run tests
            }
            }
             
             stage('Publish Cucumber Reports') {
            steps {
                cucumber buildStatus: 'UNSTABLE', fileIncludePattern: '**/*.json' // Adjust as needed
            }
        }
    }
     post {
        always {
            // Actions to perform after the pipeline completes, regardless of success or failure
            echo 'Pipeline finished.'
        }
        success {
            echo 'Maven build successful!'
        }
        failure {
            echo 'Maven build failed!'
            // You can add notifications here, e.g., email notification
        }
    }   
        
    
}

pipeline{
    agent any
    tools{
        maven "MAVEN"
    }

    stages{
        stage ("Build"){
            steps{
                echo "Running the maven tests from Jenkinsfile"
                bat "mvn clean test"
            }
        }
    }
    post{
        always{
            cleanWs()
        }
    }
    
}

pipeline{
    agent any
    tools{
        maven "MAVEN"
    }

    stages{
        stage ("Build"){
            steps{
                echo "Running the maven tests"
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
pipeline{
    agent {
		docker {image "my-app"}
	}
    tools{
        maven "MAVEN"
    }

    stages{
        stage ("Build"){
            steps{
                echo "Running the maven tests from Jenkinsfile"
                sh "docker run -d --network="host" new-app mvn -f /home/MavenFromScratch/pom.xml clean test"
            }
        }
    }
    post{
        always{
            cleanWs()
        }
    }
    
}

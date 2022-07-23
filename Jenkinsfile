pipeline{

    agent {
		dockerfile{}
	}

    stages{
        stage ("Build Image"){
            steps{
                echo "building docker image from jenkinsfile and dockerfile"
                sh "docker build -t new-app ."
            }
        }
		stage ("Docker Tests"){
            steps{
                echo "Running the docker maven tests from Jenkinsfile"
                sh "docker run -d --network='host' new-app mvn -f /home/MavenFromScratch/pom.xml clean test"
            }
        }
    }
    post{
        always{
            cleanWs()
        }
    }
    
}

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'teste build'
				bat 'set'
				bat 'mvn validate compile'
            }
        }
        stage('Test') {
            steps {
				echo 'teste test'
                //bat 'mvn test install'
		  bat 'mvn test'
            }
        }
        
		//executando testes sonar 
		stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('My_Sonar_Quality_Gate') {
                    // Optionally use a Maven environment you've configured already
                    bat 'mvn sonar:sonar'
                }
            }
        }
        
        //estagio de qulity gate
        stage("Quality Gate") {
            steps {
                timeout(time: 600, unit: 'SECONDS') {
                    // Parameter indicates whether to set pipeline to UNSTABLE if Quality Gate fails
                    // true = set pipeline to UNSTABLE, false = don't
                    // Requires SonarQube Scanner for Jenkins 2.7+
                    waitForQualityGate abortPipeline: true
                }
            }
        }
        
        stage('Deploy') {
            steps {
				echo 'Teste deploy'
                //bat 'mvn deploy'
            }
        }
    }
    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}

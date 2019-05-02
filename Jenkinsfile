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
                bat 'mvn test install'
            }
        }
        
        //exeutando testes sonar        
        stage('SonarQube analysis') {
 			withSonarQubeEnv('My_Sonar_Quality_Gate') {
                bat 'mvn sonar:sonar'
            }
        }        
        
        // No need to occupy a node
		stage("SonarQube Quality Gate"){
  			timeout(time: 1, unit: 'HOURS') { // Just in case something goes wrong, pipeline will be killed after a timeout
    		def qg = waitForQualityGate() // Reuse taskId previously collected by withSonarQubeEnv
    		if (qg.status != 'OK') {
      			error "Pipeline aborted due to quality gate failure: ${qg.status}"
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
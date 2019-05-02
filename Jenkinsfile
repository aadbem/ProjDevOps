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
        stage('Quality') {
            steps {
				echo 'teste sonar'
                bat 'mvn verify sonar:sonar'
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
pipeline {
    agent any
stages{
    stage('compute'){
        steps{
            bat 'javac Factorial.java TestFactorial.java'
            
        }
    }
    stage('Test'){
        steps{
            bat 'java TestFactorial'
        }
    }
    stage('Run'){
        steps{
            bat 'java Factorial'
        }
    }
    stage('Package Jar'){
        steps{
            bat 'jar cfm Factorial.jar manifest.txt Factorial.class'
        }
    }
    stage('Archive JAR'){
        steps{
            archiveArtifacts artifacts: 'Factorial.jar'
        }
    }
    
}
    Post{
        success{
            echo 'Build , test, run and JAR successful-artifact ready'
        }
        failure{
            echo 'Build failed'
        }
    }
   
    }

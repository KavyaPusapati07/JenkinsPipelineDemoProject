pipeline{
  agent any
  stages{
    steps{
    stage('build'){
      echo 'building'
      bat 'mvn build'
       }
    } 
    stage('test'){
      steps{
      echo 'testing'
      bat 'mvn test'
      echo ${params.VERSION}
      }
    }
  }
  parameters{
    string(name: 'VERSION',defaultValue: '',description: 'version')
  }
}
    

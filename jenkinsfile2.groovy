pipeline{
  agent any
  stages{
    stage('build'){
      echo 'building'
      bat 'mvn build'
    }
    stage('test'){
      echo 'testing'
      bat 'mvn test'
      echo ${params.VERSION}
    }
  }
  parameters{
    string(name: 'VERSION',defaultValue: '',description: 'version')
  }
}
    

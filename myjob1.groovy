job('My Job 1') {
    scm {
        git('https://github.com/Mathiaslachot/docker_jenkins.git') {  node -> 
            node / gitConfigName('mlachot  ')
            node / gitConfigEmail('mathias.lachot@eemi.com)
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('NodeJS10')
    }
    steps {
        shell("npm install")
        shell("npm test")
    }
}

multibranchPipelineJob('CI-pipeline/cart') {
    branchSources {
        github {
            id('23232323') // IMPORTANT: use a constant and unique identifier
            scanCredentialsId('GitHub')
            repoOwner('javali444')
            repository('cart')
        }
    }
}
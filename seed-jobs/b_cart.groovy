multibranchPipelineJob('CI-pipeline/cart') {
    authorization {
        permission('hudson.model.Item.Create:authenticated')
    }
    branchSources {
        github {
            id('23232323') // IMPORTANT: use a constant and unique identifier
            scanCredentialsId('GitHub')
            repository('javali444/cart')
        }
    }
}
package com.github.tomsonis.testplugin.services

import com.intellij.openapi.project.Project
import com.github.tomsonis.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

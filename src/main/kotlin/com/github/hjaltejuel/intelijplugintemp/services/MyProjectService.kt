package com.github.hjaltejuel.intelijplugintemp.services

import com.github.hjaltejuel.intelijplugintemp.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

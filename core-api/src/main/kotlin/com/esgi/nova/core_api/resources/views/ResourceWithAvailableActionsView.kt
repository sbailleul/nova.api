package com.esgi.nova.core_api.resources.views

import com.esgi.nova.core_api.difficulty.views.DetailedDifficultyView
import java.util.*

data class ResourceWithAvailableActionsView(val id: UUID, val translations: List<ResourceTranslationViewWithLanguage>, val difficulties: List<ResourceDifficultyView>, val canDelete: Boolean) {
}

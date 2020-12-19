package com.esgi.nova.query.resource_translation.query_handlers

import com.esgi.nova.core_api.pagination.PageBase
import com.esgi.nova.core_api.resource_translation.queries.FindPaginatedResourceByNameAndConcatenatedCodeQuery
import com.esgi.nova.core_api.resource_translation.views.ResourceTranslationNameView
import com.esgi.nova.query.extensions.toPageable
import com.esgi.nova.query.extensions.toStaticPage
import com.esgi.nova.query.resource_translation.ResourceTranslationRepository
import org.axonframework.queryhandling.QueryHandler
import org.springframework.stereotype.Component

@Component
open class FindPaginatedResourceByNameAndConcatenatedCodeHandler(private val resourceTranslationRepository: ResourceTranslationRepository) {

    @QueryHandler
    fun handle(query: FindPaginatedResourceByNameAndConcatenatedCodeQuery): PageBase<ResourceTranslationNameView> {
        return resourceTranslationRepository.findAllByNameStartingWithAndLanguageConcatenatedCodesStartingWith(
            name = query.name,
            concatenatedCode = query.concatenatedCode,
            page = query.toPageable()
        ).map { it.toResourceTranslationNameView() }.toStaticPage(query)
    }
}
package com.himanshoe.dashboard.data.repository

import com.himanshoe.core.util.Status
import com.himanshoe.core.util.performNetworkCall
import com.himanshoe.dashboard.data.api.DashboardApiService
import com.himanshoe.dashboard.data.request.VaccineLocatorRequest
import com.himanshoe.dashboard.data.response.VaccineLocatorResponse
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class VaccineLocatorRepositoryImpl @Inject constructor(val dashboardApiService: DashboardApiService) :
    VaccineLocatorRepository {

    override suspend fun getVaccineLocations(vaccineLocatorRequest: VaccineLocatorRequest): Flow<Status<VaccineLocatorResponse>> {
        return performNetworkCall {
            dashboardApiService.getLocations(
                vaccineLocatorRequest.districtId,
                vaccineLocatorRequest.date
            )
        }
    }
}
package com.example.prak11.repositori

import com.example.prak11.apiservice.ServiceApiSiswa
import com.example.prak11.modeldata.DataSiswa

interface RepositoryDataSiswa {
    suspend fun getDataSiswa() : List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa) : retrofit2.Response
    <Void>
}

class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
):RepositoryDataSiswa {
    override suspend fun getDataSiswa() : List<DataSiswa> =
        serviceApiSiswa.getSiswa()
    override suspend fun postDataSiswa(dataSiswa: DataSiswa):retrofit2
    .Response<Void> = serviceApiSiswa.postSiswa(dataSiswa)
}
package com.jesuslcorominas.resume.data.net.client;

import com.jesuslcorominas.resume.commons.model.OtherData;
import com.jesuslcorominas.resume.data.net.dto.OtherDataDto;
import com.jesuslcorominas.resume.data.net.util.ServerResponse;
import com.jesuslcorominas.resume.data.net.util.WebServicesKeys;

import org.joda.time.DateTime;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author Jesús López Corominas
 */
public interface OtherDataRestClient extends RestClient<OtherData> {

    interface Api {
        @GET(WebServicesKeys.Paths.otherData)
        Call<ServerResponse<List<OtherDataDto>>> list(@Query(WebServicesKeys.QueriesParams.lastDate) DateTime lastDate);


    }
}

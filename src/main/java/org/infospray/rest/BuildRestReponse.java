package org.infospray.rest;

import java.util.ArrayList;
import java.util.List;

public class BuildRestReponse {

	public static <T>  Reponse<T> build(T data){
		Reponse <T>  reponse = new Reponse<T> ();
		reponse.setError(false);
		if(data != null){
			reponse.setNbResult(1);
		}
		List<T> dataList = new ArrayList<T>();
		dataList.add(data);
		reponse.setBody(dataList);
		
		return reponse;
	}

	public static <T>  Reponse<T> buildFailed(int errorCode, String errorLibelle){
		Reponse <T>  reponse = new Reponse<T> ();
		reponse.setError(true);
		reponse.setErrorCode(errorCode);
		reponse.setErrorLibelle(errorLibelle);
		reponse.setNbResult(0);
		List<T> dataList = new ArrayList<T>();
		reponse.setBody(dataList);
		
		return reponse;
	}

	public static <T> Reponse<T> buildList(List<T> listData){
		Reponse<T> reponse = new Reponse<T>();
		reponse.setError(false);
		if(listData != null && !listData.isEmpty()){
			reponse.setNbResult(listData.size());
		}		
		reponse.setBody(listData);
		
		return reponse;
	}

}

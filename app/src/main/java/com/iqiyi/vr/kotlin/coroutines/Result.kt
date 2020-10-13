package com.iqiyi.vr.kotlin.coroutines


sealed class Result<out R> {
    data class Sucess<out T>(val  data:T) : Result<T>()
}
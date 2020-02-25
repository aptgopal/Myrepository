package com.developers.mvvmsample.utils

import io.reactivex.Scheduler


/**
 * Created by Gopal A on 10/2/18.
 */
interface ISchedulerProvider {
    fun ui(): Scheduler

    fun computation(): Scheduler

    fun io(): Scheduler
}
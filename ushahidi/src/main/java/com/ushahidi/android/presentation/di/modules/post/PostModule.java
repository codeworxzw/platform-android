/*
 * Copyright (c) 2015 Ushahidi Inc
 *
 * This program is free software: you can redistribute it and/or modify it under
 *  the terms of the GNU Affero General Public License as published by the Free
 *  Software Foundation, either version 3 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 *  FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program in the file LICENSE-AGPL. If not, see
 *  https://www.gnu.org/licenses/agpl-3.0.html
 */

package com.ushahidi.android.presentation.di.modules.post;

import com.addhen.android.raiburari.domain.usecase.Usecase;
import com.addhen.android.raiburari.presentation.di.qualifier.ActivityScope;
import com.ushahidi.android.domain.usecase.deployment.ActivateDeploymentUsecase;
import com.ushahidi.android.domain.usecase.deployment.ListDeploymentUsecase;
import com.ushahidi.android.domain.usecase.user.GetUserProfileUsecase;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author Ushahidi Team <team@ushahidi.com>
 */
@Module
public class PostModule {

    @Provides
    @ActivityScope
    @Named("deploymentList")
    Usecase provideDeploymetListUseCase(ListDeploymentUsecase listDeploymentUsecase) {
        return listDeploymentUsecase;
    }

    @Provides
    @ActivityScope
    @Named("userprofileGet")
    GetUserProfileUsecase provideGetUserProfileUseCase(
            GetUserProfileUsecase getUserProfileUsecase) {
        return getUserProfileUsecase;
    }

    @Provides
    @ActivityScope
    @Named("deploymentActivate")
    ActivateDeploymentUsecase provideActivateDeploymentUsecase(
            ActivateDeploymentUsecase activateDeploymentUsecase) {
        return activateDeploymentUsecase;
    }
}

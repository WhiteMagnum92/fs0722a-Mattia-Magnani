import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from '../login/login.component';
import { SignupComponent } from '../signup/signup.component';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { TokenInterceptor } from '../token.interceptor';
import {HTTP_INTERCEPTORS} from '@angular/common/http'



@NgModule({
  declarations: [
    LoginComponent,
    SignupComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    RouterModule.forChild({
      {
        path:'login',
        component: LoginComponent
      },
      {
        path:'signup',
        component: SignupComponent,
      }
    })

  ],
})
export class AuthModule { }

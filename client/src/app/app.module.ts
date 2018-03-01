import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { ApiModule, BASE_PATH } from './shared/api-clients';
import { environment } from '../environments/environment';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ApiModule,
  ],
  providers: [
    {
      provide: BASE_PATH,
      useValue: environment.API_BASE_PATH
    }],
  bootstrap: [AppComponent]
})
export class AppModule { }

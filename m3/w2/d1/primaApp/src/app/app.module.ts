import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { Component1Component } from './components/component1/component1.component';
import { PrimoComponenteComponent } from './primo-componente/primo-componente.component';
import { Componente1Component } from './componenti/componente1/componente1.component';

@NgModule({
  declarations: [
    AppComponent,
    Component1Component,
    PrimoComponenteComponent,
    Componente1Component
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { Component, OnInit } from '@angular/core';
import { LogService } from 'src/app/service/log.service';
import { UsersService } from 'src/app/service/users.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.scss']
})
export class UserComponent implements OnInit {
  input()user:any;
  @Input()id!:number;


  constructor(private logSrv:LogService, private userSrv: UsersService) { }

  ngOnInit(): void {
  }

}

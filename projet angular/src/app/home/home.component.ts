import { Component, OnInit, Input} from '@angular/core';
import { FaceSnap } from '../models/face-snap.model';
import { FaceSnapsService } from '../services/face-snaps.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  @Input() faceSnap!: FaceSnap;
  buttonText!: string;
  constructor(private faceSnapsService: FaceSnapsService) { }

  ngOnInit(): void {      
      this.buttonText= 'Oh Snap!';
    }
    onSnap()  {
      if (this.buttonText === 'Oh Snap!') {
          this.faceSnapsService.snapFaceSnapById(this.faceSnap.id, 'snap');
          this.buttonText = 'Oops, unSnap!';
      } else {
          this.faceSnapsService.snapFaceSnapById(this.faceSnap.id, 'unsnap');
          this.buttonText = 'Oh Snap!';
      }
  }
  }



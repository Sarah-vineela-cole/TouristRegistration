import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatTouristListComponent } from './create-tourist-list.component';

describe('CreateTouristListComponent', () => {
  let component: CreatTouristListComponent;
  let fixture: ComponentFixture<CreatTouristListComponent>;

  beforeEach(async (async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreatTouristListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {

    fixture = TestBed.createComponent(CreatTouristListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

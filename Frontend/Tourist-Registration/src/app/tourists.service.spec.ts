import { TestBed } from '@angular/core/testing';

import { TouristService } from './tourists.service';

describe('TouristsService', () => {
  let service: TouristService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TouristService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
